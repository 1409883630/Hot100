//1. ����֮��
//����һ���������� nums?��һ������Ŀ��ֵ target�������ڸ��������ҳ� ��ΪĿ��ֵ target? ����?����?���������������ǵ������±ꡣ

//����Լ���ÿ������ֻ���Ӧһ���𰸡����ǣ�������ͬһ��Ԫ���ڴ��ﲻ���ظ����֡�

//����԰�����˳�򷵻ش𰸡�
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] a=new int[2];
         for(int i=0;i<nums.length;i++){
             int res=nums[i];
             for(int j=i+1;j<nums.length;j++){
                 if(res+nums[j]==target){
                     a[0]=i;
                     a[1]=j;
                      return a;
             }
             }  
         }
         return a;
        //  // ����k-v ��һһ��Ӧ�Ĺ�ϣ��
        // HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
        // for(int i = 0; i < nums.length; i++){
        //     if(hash.containsKey(nums[i])){
        //         indexs[0] = i;
        //         indexs[1] = hash.get(nums[i]);
        //         return indexs;
        //     }
        //     // �����ݴ��� keyΪ���� ��valueΪ�±�
        //     hash.put(target-nums[i],i);
        // }
    }
}
