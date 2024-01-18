package ch05_reference;

public class Ex03_1_mines {
    public static void main(String[] args) {
        char[][] mines = new char[8][8];
        for(int i = 0;i<mines.length;i++) {
            for (int k = 0; k < mines[i].length; k++) {
                mines[i][k] = (Math.random() > 0.7) ? '*' : '.';
            }
        }
        printMines(mines);
        System.out.println();
        char[][] mineResult = checkMines(mines);
        for(int i=0;i<8;i++){
            for(int k=0;k<8;k++){
                System.out.print(mineResult[i][k]+" ");
            }
            System.out.println();
        }
    }

    static void printMines(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr[i].length; k++) {
                System.out.print(arr[i][k] + " ");
            }
            System.out.println();
        }
    }

    static char[][] checkMines(char[][] arr){
        char[][] result = new char[arr.length][arr[0].length];
        for(int i=0;i<arr.length;i++){
            for(int k=0; k<arr.length;k++){
                if(arr[i][k] == '*'){ //지뢰인경우 바로 지뢰표시하고 continue로 넘어감
                    result[i][k]='*';
                    continue;
                }else{
                    int cnt = 0;
                    if(!(i==0 || i == (arr.length-1))){ //첫행 or 마지막 행이 아닌경우
                        if (!(k==0 || k== (arr.length-1))){ //첫열 or 마지막 열이 아닌경우
                            if(arr[i-1][k-1]=='*'){//왼쪽 대각선 위
                                cnt +=1;
                            }
                            if(arr[i-1][k] == '*'){//위
                                cnt +=1;
                            }
                            if(arr[i-1][k+1] == '*'){//오른쪽 대각선 위
                                cnt +=1;
                            }
                            if(arr[i][k-1] == '*'){//왼쪽
                                cnt +=1;
                            }
                            if(arr[i][k+1] == '*'){//오른쪽
                                cnt +=1;
                            }
                            if(arr[i+1][k-1] == '*'){//왼쪽 아래 대각선
                                cnt +=1;
                            }
                            if(arr[i+1][k] == '*'){//아래
                                cnt +=1;
                            }
                            if(arr[i+1][k+1] == '*'){//오른쪽 아래 대각선
                                cnt +=1;
                            }
                            result[i][k]=(char)(cnt +'0');
                        }else if(k==0){//첫열일 경우
//                            if(arr[i-1][k-1]=='*'){//왼쪽 대각선 위
//                                cnt +=1;
//                            }
                            if(arr[i-1][k] == '*'){//위
                                cnt +=1;
                            }
                            if(arr[i-1][k+1] == '*'){//오른쪽 대각선 위
                                cnt +=1;
                            }
//                            if(arr[i][k-1] == '*'){//왼쪽
//                                cnt +=1;
//                            }
                            if(arr[i][k+1] == '*'){//오른쪽
                                cnt +=1;
                            }
//                            if(arr[i+1][k-1] == '*'){//왼쪽 아래 대각선
//                                cnt +=1;
//                            }
                            if(arr[i+1][k] == '*'){//아래
                                cnt +=1;
                            }
                            if(arr[i+1][k+1] == '*'){//오른쪽 아래 대각선
                                cnt +=1;
                            }
                            result[i][k]=(char)(cnt +'0');
                        }else{//마지막 열일 경우
                            if(arr[i-1][k-1]=='*'){//왼쪽 대각선 위
                                cnt +=1;
                            }
                            if(arr[i-1][k] == '*'){//위
                                cnt +=1;
                            }
//                            if(arr[i-1][k+1] == '*'){//오른쪽 대각선 위
//                                cnt +=1;
//                            }
                            if(arr[i][k-1] == '*'){//왼쪽
                                cnt +=1;
                            }
//                            if(arr[i][k+1] == '*'){//오른쪽
//                                cnt +=1;
//                            }
                            if(arr[i+1][k-1] == '*'){//왼쪽 아래 대각선
                                cnt +=1;
                            }
                            if(arr[i+1][k] == '*'){//아래
                                cnt +=1;
                            }
//                            if(arr[i+1][k+1] == '*'){//오른쪽 아래 대각선
//                                cnt +=1;
//                            }
                            result[i][k]=(char)(cnt +'0');
                        }
                    }if(i==0){//첫행일경우
                        if(!((k==0) || (k== (arr[0].length-1)))){//첫행이지만 첫열, 마지막열이 아닌경우
//                            if(arr[i-1][k-1]=='*'){//왼쪽 대각선 위
//                                cnt +=1;
//                            }
//                            if(arr[i-1][k] == '*'){//위
//                                cnt +=1;
//                            }
//                            if(arr[i-1][k+1] == '*'){//오른쪽 대각선 위
//                                cnt +=1;
//                            }
                            if(arr[i][k-1] == '*'){//왼쪽
                                cnt +=1;
                            }
                            if(arr[i][k+1] == '*'){//오른쪽
                                cnt +=1;
                            }
                            if(arr[i+1][k-1] == '*'){//왼쪽 아래 대각선
                                cnt +=1;
                            }
                            if(arr[i+1][k] == '*'){//아래
                                cnt +=1;
                            }
                            if(arr[i+1][k+1] == '*'){//오른쪽 아래 대각선
                                cnt +=1;
                            }
                            result[i][k]=(char)(cnt +'0');
                        }else if(k==0){// 첫행. 첫 열인 경우
//                            if(arr[i-1][k-1]=='*'){//왼쪽 대각선 위
//                                cnt +=1;
//                            }
//                            if(arr[i-1][k] == '*'){//위
//                                cnt +=1;
//                            }
//                            if(arr[i-1][k+1] == '*'){//오른쪽 대각선 위
//                                cnt +=1;
//                            }
//                            if(arr[i][k-1] == '*'){//왼쪽
//                                cnt +=1;
//                            }
                            if(arr[i][k+1] == '*'){//오른쪽
                                cnt +=1;
                            }
//                            if(arr[i+1][k-1] == '*'){//왼쪽 아래 대각선
//                                cnt +=1;
//                            }
                            if(arr[i+1][k] == '*'){//아래
                                cnt +=1;
                            }
                            if(arr[i+1][k+1] == '*'){//오른쪽 아래 대각선
                                cnt +=1;
                            }
                            result[i][k]=(char)(cnt +'0');
                        }else{//첫행. 마지막열인 경우
//                            if(arr[i-1][k-1]=='*'){//왼쪽 대각선 위
//                                cnt +=1;
//                            }
//                            if(arr[i-1][k] == '*'){//위
//                                cnt +=1;
//                            }
//                            if(arr[i-1][k+1] == '*'){//오른쪽 대각선 위
//                                cnt +=1;
//                            }
                            if(arr[i][k-1] == '*'){//왼쪽
                                cnt +=1;
                            }
//                            if(arr[i][k+1] == '*'){//오른쪽
//                                cnt +=1;
//                            }
                            if(arr[i+1][k-1] == '*'){//왼쪽 아래 대각선
                                cnt +=1;
                            }
                            if(arr[i+1][k] == '*'){//아래
                                cnt +=1;
                            }
//                            if(arr[i+1][k+1] == '*'){//오른쪽 아래 대각선
//                                cnt +=1;
//                            }
                            result[i][k]=(char)(cnt +'0');
                        }
                    }if(i==arr.length-1){ //마지막행인 경우
                        if(!((k==0)||(k==(arr[0].length-1)))){ // 마지막행이지만 첫열, 마지막열이 아닌경우
                            if(arr[i-1][k-1]=='*'){//왼쪽 대각선 위
                                cnt +=1;
                            }
                            if(arr[i-1][k] == '*'){//위
                                cnt +=1;
                            }
                            if(arr[i-1][k+1] == '*'){//오른쪽 대각선 위
                                cnt +=1;
                            }
                            if(arr[i][k-1] == '*'){//왼쪽
                                cnt +=1;
                            }
                            if(arr[i][k+1] == '*'){//오른쪽
                                cnt +=1;
                            }
//                            if(arr[i+1][k-1] == '*'){//왼쪽 아래 대각선
//                                cnt +=1;
//                            }
//                            if(arr[i+1][k] == '*'){//아래
//                                cnt +=1;
//                            }
//                            if(arr[i+1][k+1] == '*'){//오른쪽 아래 대각선
//                                cnt +=1;
//                            }
                            result[i][k]=(char)(cnt +'0');
                        }else if(k==0){ //마지막행, 첫열인경우
//                            if(arr[i-1][k-1]=='*'){//왼쪽 대각선 위
//                                cnt +=1;
//                            }
                            if(arr[i-1][k] == '*'){//위
                                cnt +=1;
                            }
                            if(arr[i-1][k+1] == '*'){//오른쪽 대각선 위
                                cnt +=1;
                            }
//                            if(arr[i][k-1] == '*'){//왼쪽
//                                cnt +=1;
//                            }
                            if(arr[i][k+1] == '*'){//오른쪽
                                cnt +=1;
                            }
//                            if(arr[i+1][k-1] == '*'){//왼쪽 아래 대각선
//                                cnt +=1;
//                            }
//                            if(arr[i+1][k] == '*'){//아래
//                                cnt +=1;
//                            }
//                            if(arr[i+1][k+1] == '*'){//오른쪽 아래 대각선
//                                cnt +=1;
//                            }
                            result[i][k]=(char)(cnt +'0');
                        }else{
                            if(arr[i-1][k-1]=='*'){//왼쪽 대각선 위
                                cnt +=1;
                            }
                            if(arr[i-1][k] == '*'){//위
                                cnt +=1;
                            }
//                            if(arr[i-1][k+1] == '*'){//오른쪽 대각선 위
//                                cnt +=1;
//                            }
                            if(arr[i][k-1] == '*'){//왼쪽
                                cnt +=1;
                            }
//                            if(arr[i][k+1] == '*'){//오른쪽
//                                cnt +=1;
//                            }
//                            if(arr[i+1][k-1] == '*'){//왼쪽 아래 대각선
//                                cnt +=1;
//                            }
//                            if(arr[i+1][k] == '*'){//아래
//                                cnt +=1;
//                            }
//                            if(arr[i+1][k+1] == '*'){//오른쪽 아래 대각선
//                                cnt +=1;
//                            }
                            result[i][k]=(char)(cnt +'0');
                        }
                    }
                }
            }
        }
        return result;
    }
}