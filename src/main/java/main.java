import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入操作数字（1=更新,2=查询，3=退出）：");
        int operate=sc.nextInt();
        while(true){
            if(operate==3) {
                System.out.println("操作结束！");
                break;
            }
            else if(operate==1){
                Test test = new Test();
                test.deleteAll();
                List<UserInfo> fuzhou=HCGET.search_fuzhou();
                UserInfo user1=new UserInfo("福州","101230101",26.07530,119.30623,fuzhou.get(0).getFxDate(),fuzhou.get(0).getTempMax(),fuzhou.get(0).getTempMin(),fuzhou.get(0).getTextDay());
                UserInfo user2=new UserInfo("福州","101230101",26.07530,119.30623,fuzhou.get(1).getFxDate(),fuzhou.get(1).getTempMax(),fuzhou.get(1).getTempMin(),fuzhou.get(1).getTextDay());
                UserInfo user3=new UserInfo("福州","101230101",26.07530,119.30623,fuzhou.get(2).getFxDate(),fuzhou.get(2).getTempMax(),fuzhou.get(2).getTempMin(),fuzhou.get(2).getTextDay());
                List<UserInfo> beijing=HCGET.search_beijing();
                UserInfo user4=new UserInfo("北京","101010100",39.90498,116.40528,beijing.get(0).getFxDate(),beijing.get(0).getTempMax(),beijing.get(0).getTempMin(),beijing.get(0).getTextDay());
                UserInfo user5=new UserInfo("北京","101010100",39.90498,116.40528,beijing.get(1).getFxDate(),beijing.get(1).getTempMax(),beijing.get(1).getTempMin(),beijing.get(1).getTextDay());
                UserInfo user6=new UserInfo("北京","101010100",39.90498,116.40528,beijing.get(2).getFxDate(),beijing.get(2).getTempMax(),beijing.get(2).getTempMin(),beijing.get(2).getTextDay());
                List<UserInfo> shanghai=HCGET.search_shanghai();
                UserInfo user7=new UserInfo("上海","101020100",31.23170,121.47264,shanghai.get(0).getFxDate(),shanghai.get(0).getTempMax(),shanghai.get(0).getTempMin(),shanghai.get(0).getTextDay());
                UserInfo user8=new UserInfo("上海","101020100",31.23170,121.47264,shanghai.get(1).getFxDate(),shanghai.get(1).getTempMax(),shanghai.get(1).getTempMin(),shanghai.get(1).getTextDay());
                UserInfo user9=new UserInfo("上海","101020100",31.23170,121.47264,shanghai.get(2).getFxDate(),shanghai.get(2).getTempMax(),shanghai.get(2).getTempMin(),shanghai.get(2).getTextDay());
                test.insert(user1);test.insert(user2);test.insert(user3);test.insert(user4);test.insert(user5);test.insert(user6);test.insert(user7);test.insert(user8);test.insert(user9);
                System.out.println("更新成功！");
            }
            else if(operate==2){
                System.out.println("请输入您所要查询的数字（1=福州，2=北京，3=上海）：");
                int operate1=sc.nextInt();
                Test test = new Test();
                List<UserInfo> list = new ArrayList<>();
                if(operate1==1) list=test.findByCity("福州");
                else if(operate1==2) list=test.findByCity("北京");
                else if(operate1==3) list=test.findByCity("上海");
                for(int i=0;i<list.size();i++) {
                    System.out.println(list.get(i).toString());
                    System.out.println();
                }
                System.out.println("查询成功！");
            }
            System.out.println("请输入操作数字（1=更新,2=查询，3=退出）：");
            operate=sc.nextInt();
        }

    }

}
