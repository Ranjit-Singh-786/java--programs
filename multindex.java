// multIndex array
class MultIndex{
public static void main(String ar []){
int marks [][]=new int[5][5];
int num=1;
for(int i=0;i<5;i++){
  for(int j=0;j<5;j++){
marks[i][j]=num;
num++;
}
}
//for value print loop start
System.out.println("this multiindex elemnts array");
for(int i=0;i<5;i++){
for(int j=0;j<5;j++){
System.out.print(marks[i][j]);
}
System.out.println();
}}}