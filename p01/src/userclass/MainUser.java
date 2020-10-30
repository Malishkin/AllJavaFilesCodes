package userclass;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class MainUser {
    public static void main(String[] args) {
//        User[]u_arr = new User[2];
//        u_arr[0] = new User(5,"admin","abc");
//        u_arr[1] = new User(6,"name","xyz");
//        for(int i = 0; i<u_arr.length; i++){
//            System.out.println("id = "+u_arr[i].id+", login = "+u_arr[i].login+", password = "+u_arr[i].password);
//        }
//        for (User temp : u_arr){
//            temp.id = 15;
//            System.out.println("id = "+temp.id+", login = "+temp.login+", password = "+temp.password);
//        }
//        User user = new User(0, "guest", " ");
//        System.out.println(user.getTextInfo());
//        user.setPassword("thallium2");
//        System.out.println(user.getPassword());
        UserSocial userSocial = new UserSocial(309,"admin", "thallium3", "Malishkin", 46);
        System.out.println(userSocial.getTextInfo());
        WebMaster webMaster = new WebMaster(286, "malishkin", "thallium2", "www.ormusic.co.il");
        System.out.println(webMaster.getTextInfo());
        User u = new UserSocial(22, "guest", "narochnij", "Sveta", 32);
        System.out.println(u.getTextInfo());
        u.printUser();
        webMaster.printUser();
        userSocial.printUser();
        User user = new User(78,"malishkin", "thallium2"){
            public void printUser(){
                System.out.println("My id is "+id+", login is "+login+", password is "+password);
            }
        };
        user.printUser();
        PrintData printData = new PrintData() {
            @Override
            public void printUser() {
                System.out.println("Я печатаю что-то просто так");

            }
        };

        printData.printUser();
        UserSocial userSocial1 = userSocial;
        userSocial1=userSocial.clone();
        userSocial.password = "narochnij";
        System.out.println(userSocial1);
        WebMaster webMaster1 = webMaster.clone();
        System.out.println(webMaster1);
        webMaster.setWebCite("www.google.com");
        System.out.println(webMaster);



        }



    }

