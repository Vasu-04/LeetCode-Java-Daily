class Solution {
    int[] value = {1,5,10,50,100,500,1000};
    char[] symbol = {'I','V','X','L','C','D','M'};
    int sum = 0;
    public int getIndex(char s){
        for(int i=0;i<symbol.length;i++){
            if(symbol[i] == s){
                return i;
            }
        }
        return 0;
    }
    public int romanToInt(String s) {
        int i;
        for(i=0;i<(s.length()-1);i++){
            if(s.charAt(i) == 'I'){
                if(s.charAt(i+1) == 'V' || s.charAt(i+1) == 'X'){
                    int valueAtI0 = value[getIndex(s.charAt(i))];
                    int valueAtI1 = value[getIndex(s.charAt(i+1))];
                    sum += (valueAtI1 - valueAtI0);
                    i++;
                }
                else{
                    sum  += 1;
                }
            }
            else if(s.charAt(i) == 'X'){
                if(s.charAt(i+1) == 'L' || s.charAt(i+1) == 'C'){
                    int valueAtI0 = value[getIndex(s.charAt(i))];
                    int valueAtI1 = value[getIndex(s.charAt(i+1))];
                    sum += (valueAtI1 - valueAtI0);
                    i++;
                }
                else{
                    sum  += 10;
                }
            }
            else if(s.charAt(i) == 'C'){
                if(s.charAt(i+1) == 'D' || s.charAt(i+1) == 'M'){
                    int valueAtI0 = value[getIndex(s.charAt(i))];
                    int valueAtI1 = value[getIndex(s.charAt(i+1))];
                    sum += (valueAtI1 - valueAtI0);
                    i++;
                }
                else{
                    sum  += 100;
                }
            }
            else{
                int valueTemp = value[getIndex(s.charAt(i))] ;
                sum += valueTemp;
            }
        }
        if(i == s.length()-1){
            sum += value[getIndex(s.charAt(i))];
        }
        return sum;
    }
}
