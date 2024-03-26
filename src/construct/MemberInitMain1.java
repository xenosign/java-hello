package construct;

public class MemberInitMain1 {

    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.name = "학생1";
        member1.age = 16;
        member1.grade = 90;

        MemberInit member2 = new MemberInit();
        initMember(member2, "학생2", 17, 80);

        MemberInit[] members = {member1, member2};

        for (MemberInit member : members) {
            System.out.println(member.name + " / " + member.age + " / " + member.grade);
        }
    }

    static void initMember(MemberInit member, String name, int age, int grade) {
        member.name = name;
        member.age = age;
        member.grade = grade;
    }
}
