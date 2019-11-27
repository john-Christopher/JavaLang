
package sevilla_bsit2b_labperff;

public class AddressBookEntry {
    private String name;
    private String add;
    private int tel;
    private String email;

    public AddressBookEntry(){
        name = "";
        add = "";
        tel = 0;
        email = "";

    }

    public AddressBookEntry(String name, String add, int tel, String email){
        this.name = name;
        this.add = add;
        this.tel = tel;
        this.email = email;
    }

    public String getName(){
        return name;
    }
    public void changeName(String name){
        this.name = name;
    }
    public String getAddress(){
        return add;
    }
    public void changeAddress(String add){
        this.add = add;
    }
    public int getTelNumber(){
        return tel;
    }
    public void changeTelNumber(int tel){
        this.tel = tel;
    }
    public String getEmailAdd(){
        return email;
    }
    public void changeEmailAdd(String email){
        this.email = email;
    }
}
