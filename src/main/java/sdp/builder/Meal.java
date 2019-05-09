package sdp.builder;

public class Meal {
    String cola;
    String ham;
    String chips;
    String chicken;


    public void show(){
        StringBuffer stringBuffer=new StringBuffer();
        if(cola!=null){
            stringBuffer.append(cola);
        }
        if(ham!=null){
            stringBuffer.append(ham);
        }
        if(chips!=null){
            stringBuffer.append(chips);
        }
        if(chicken!=null){
            stringBuffer.append(chicken);
        }
        System.out.println(stringBuffer);
    }

}
