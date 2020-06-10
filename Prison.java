public class Prison {

	public static void main(String[] args){

     Prisonernumber PnumA = Prisonernumber.getInstance();
    Prisonernumber PnumB = Prisonernumber.getInstance();

	System.out.println( "囚人番号"+PnumA.getNumber() );
	System.out.println( "囚人番号"+PnumB.getNumber() );
	}
}

class Prisonernumber{
    private static Prisonernumber Pnum = new Prisonernumber();
    public static int i;

    private Prisonernumber() {
        i=0;
    }

    public static Prisonernumber getInstance() {
        return Pnum;
    }

    public static String getNumber(){
		i++;
		return (String.format("%04d",i));
	}
                
}