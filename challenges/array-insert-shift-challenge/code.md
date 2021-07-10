```
public int[] center(int[] inputArr, int val){
        int idxPos = 0;
        int[] newArr = new int[inputArr.length+1];
        if (inputArr%2 ==0){
            idxPos = inputArr.length/2;
        }else{
            idxPos = (inputArr.length-1)/2;
        }
        for (int i=0 ; i<inputArr.length+1;i++){
            if (i=idxPos){
                newArr[i] = val;
            }else if(i<idxPos){
                newArr[i] = inputArr[i];
            }else{
                newArr[i] = inputArr[i-1];
            }
        }
        return newArr;
    }
