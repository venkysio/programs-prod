def maxSubArray(self, nums):
        cursum=0
        maxsum=nums[0]
        for i in range(len(nums)):
            cursum=max(cursum+nums[i],nums[i])
            maxsum=max(maxsum,cursum)
        return maxsum
        