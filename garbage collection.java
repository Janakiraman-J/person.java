 class FinalizeExample {
public static void main(String arg[]) {
FinalizeExample f=new FinalizeExample();
System.out.println("Hash Code: "+f.hashCode());
f=null;
System.gc();
System.out.println("End of the grabage collection");}
@Override
protected void finalize(){ 
System.out.println("Called the finalize");}}