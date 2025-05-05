import java.lang.reflect.Member;
import java.util.ArrayList;

public class ClubMembers {
    private ArrayList<MemberInfo> memberList;
    public ClubMembers(){
    memberList = new ArrayList<MemberInfo>();
}

    public ArrayList<MemberInfo> getMemberList(){
        return memberList;
    }

    /**
     * Adds new club members to memberList, as described in part (a).
     * Precondition: names is a non-empty array.
     */
    public void addMembers(String[] names, int gradYear) {
        for(String s : names){
            memberList.add(new MemberInfo(s,gradYear,true));
        }
    }

    public void setMemberList(ArrayList<MemberInfo> members){
        memberList = members;
    }

    /**
     * Removes members who have graduated and returns a list of members who have
     * graduated
     * and are in good standing, as described in part (b).
     */
    public ArrayList<MemberInfo> removeMembers(int year) {
      ArrayList<MemberInfo> alumni = new ArrayList<MemberInfo>();
      for(int i =0; i<memberList.size(); i++){
        MemberInfo member = memberList.get(i);
        if(member.getGradYear()<=year){
            if(member.inGoodStanding()) alumni.add(member);
            memberList.remove(i);
            i--;
        }
      }
    return alumni;
}
    // There may be instance variables, constructors, and methods that are not
    // shown.
}
