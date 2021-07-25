class Box{
private int length,breadth,height;
public void setDeminsion(int l ,int b,int h){
length=l;breadth=b;height=h;
}
public void showDimens(){
System.out.println("L"+length);
System.out.println("B"+breadth);
System.out.println("H"+height);
}

//object creation

Box smallbox = new Box();
smallbox.setDeminsion(12,10,5);
//smallbox.showDimens();
}