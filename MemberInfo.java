public class MemberInfo {
    /**
     * Constructs a MemberInfo object for the club member with name name,
     * graduation year gradYear, and standing hasGoodStanding.
     */
    private boolean hasGoodStanding;
    private int gradYear;
    private String name;
    public MemberInfo(String name, int gradYear, boolean hasGoodStanding) {
        this.name = name;
        this.hasGoodStanding = hasGoodStanding;
        this.gradYear = gradYear;
        
     }
     public String toString(){
        String s ="\nName: "+name+"\n";
        s+="Year: "+gradYear+"\n";
        return s+"Good Standing: "+hasGoodStanding+"\n";
     }

    /** Returns the graduation year of the club member. */
    public int getGradYear() {
    return gradYear;    
    }


    /** Returns true if the member is in good standing and false otherwise. */
    public boolean inGoodStanding() {
       return hasGoodStanding;
    }
    // There may be instance variables, constructors, and methods that are not
    // shown.
}
