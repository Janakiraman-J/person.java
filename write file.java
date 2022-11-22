 class WriteToFile {// update the new text into file
public static void main(String args[]){
try{
FileWriter fwrite=new FileWriter("D:/JavaProgram/Hi.txt");
fwrite.write("Happy birthday");
fwrite.close();
System.out.println("wrote to the file done");
}catch(IOException e) {
e.printStackTrace();}
}
}