package construct;

public class MemberInitMain2 {

    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.initMember("학생1", 16, 90);

        MemberInit member2 = new MemberInit();
        member2.initMemberByThis("학생2", 17, 80);

        MemberInit[] members = {member1, member2};

        for (MemberInit member : members) {
            System.out.println(member.name + " / " + member.age + " / " + member.grade);
        }
    }
}
