	class Solution {
		vector<vector<int>> res;
		void dfs(int cur, vector<int>& nums, vector<int>& temp){
			res.emplace_back(temp);
			for(int i = cur; i < nums.size(); ++i){
				temp.emplace_back(nums[i]);
				dfs(i + 1, nums, temp);
				temp.pop_back();
			}
		}
	public:
		vector<vector<int>> subsets(vector<int>& nums) {
			if(nums.empty()) return {};
			vector<int> temp;
			dfs(0, nums, temp);
			return res;
		}
	};