package java0530.collection;

public class MemberArrayListEx {
    public static void main(String[] args) {
        MemberArrayList memberArrayList = new MemberArrayList();
        Member memberLee = new Member(1001,"이지원");
        Member memberSon = new Member(1002,"손흥민");
        Member memberPack = new Member(1003,"박찬호");
        Member memberHong = new Member(1004,"홍길동");

        memberArrayList.addMember(memberLee);
        memberArrayList.addMember(memberSon);
        memberArrayList.addMember(memberPack);
        memberArrayList.addMember(memberHong);

        memberArrayList.showAllMember();

        memberArrayList.removeMember(memberHong.getMemberId());
        memberArrayList.showAllMember();
    }
}
