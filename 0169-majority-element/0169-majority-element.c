int majorityElement(int* nums, int numsSize){
  int res = nums[0],counter=0;
  for(int i=0;i<numsSize;i++){
      if(counter==0){
          res=nums[i];
      }
      if(nums[i]==res){
          counter++;
      }else{
          counter--;
      }
  }
  return res;
}