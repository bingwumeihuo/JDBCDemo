package com.imooc.action;
import com.imooc.dao.GoddessDao;
import com.imooc.model.Goddess;
import java.util.Date;
import java.util.List;

public class GoddessAction {
    public static void main(String[] args) throws Exception {
        GoddessDao g=new GoddessDao();
        List<Goddess> gs=g.query();
        for (Goddess goddess:gs) {
            //System.out.println(goddess.getUser_name()+","+goddess.getAge());
            Goddess g1=new Goddess();
            g1.setUser_name("小夏");
            g1.setAge(22);
            g1.getSex(1);
            g1.getBirthday(new Date());
            g1.getEmail("1183233389@qq.com");
            goddess.setCreate_user("ADMIN");
            goddess.setUpdate_user("ADMIN");
            goddess.setIsdel(1);
            g.addGoddess(g1);



        }
    }

}

