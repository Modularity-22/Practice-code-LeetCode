	class Solution {
	private:
		vector<vector<int>> res_;
		vector<int> candidates_;
		int target_;
	public:
		vector<vector<int>> combinationSum(vector<int>& candidates, int target) {
			if(candidates.empty()) return res_;
			candidates_ = candidates;
			target_ = target;
			vector<int> cur;
			recursion(0, 0, cur);
			return res_;
		}
		void recursion(int index, int sum, vector<int>& cur){
			if(sum == target_) res_.push_back(cur);
			else if(sum < target_){
				int size = candidates_.size();
				for(int i = index; i < size; ++i){
					cur.push_back(candidates_[i]);
					recursion(i, sum + candidates_[i], cur);
					cur.pop_back();
				}
			}
		}
	};