package neha_practice;

public class fghj {

	
	
	
	Go ahead and type your solution here or copy and paste it from an external editor.

    public class employee {

        int employee_id;
        String name;
        String department;
        List<Friendship> friendships_list;

        public employee(int employee_id, String name, String department) {


            this.employee_id = employee_id;
            this.name = name;
            this.department = department;
            friendships_list = new ArrayList<Friendship>();
        }

        public void Setemployee_id(int employee_id) {

            this.employee_id = employee_id;

        }

        public int getEmployee_id() {

            return employee_id;
        }

        public void Setname(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setdepartment(String department) {
            this.department = department;
        }

        public String getDepartment() {
            return department;
        }

        public void addFriendShip(Friendship f) {
            friendships_list.add(f);
        }

        public List<Friendship> getFriendship() {
            return friendships_list;
        }
    }
        public class Friendship{

            int id_1,id_2;
            public Friendship(int id_1, int id_2){

                this.id_1=id_1;
                this.id_2=id_2;
            }

            public int getID1(){
                return id_1;
            }
            public int getID2(){
                return id_2;
            }


        }

    

    HashMap<Integer,employee> hm =new HashMap<Integer,employee>();

    public static void  main(String args[]){

        String file1ToParse = "employees.csv";
        String file2ToParse="friendships.csv";
        BufferedReader fileReader = null;
        BufferedReader fileReader2=null; 
        //Delimiter used in CSV file
        final String DELIMITER = ",";
        try
        {
            String line = "";
            //Create the file reader
            fileReader = new BufferedReader(new FileReader(file1ToParse));
            fileReader2 =new BufferedReader(new FileReader(file2ToParse));
            //Read the file line by line
            while ((line = fileReader.readLine()) != null)
            {
                //Get all tokens available in line
                String[] tokens = line.split(DELIMITER);
                employee e=new employee(Integer.valueOf(tokens[0]),tokens[1],tokens[2]);//1, richart, deptname
                hm.put(Integer.parseInt(tokens[0]),e);
            }
            line="";
            while ((line = fileReader2.readLine()) != null)
            {
                //Get all tokens available in line
                String[] tokens = line.split(DELIMITER);
                Friendship f=Friendship(Integer.valueOf(tokens[0]), Integer.valueOf(tokens[1]));//coz friendship class has id1,id2
                hm.put(Integer.valueOf(tokens[0], hm.get(Integer.valueOf(tokens[0])).addFriendship(f));
                //employee e_get=hm.get(Integer.valueOf(tokens[0]));
                //e.addFriendship(f); like updating employee with addin friendshiplist. 
               // hm.put(Integer.valueOf(tokens[0]),e)
                        hm.put(Integer.valueOf(tokens[1], hm.get(Integer.valueOf(tokens[1])).addFriendship(f));

            }


        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally
        {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        getRelationShips();
    }

    public void getRelationShips(){

        for(HashMap.EntrySet<Integer,employee>me:hm.entrySet()){
            employee e = me.getValue();//going thru hm ie folder, n printing out. 1 papaer each , me=1, richard, health, id2
            StringBuffer sb=new StringBuffer();
            sb.append(e.getName+": ");
            boolean notFirst=false;
            if(e.getFriendship().size()>0){
                for(Friendship f :e.getFriendship()){//every friendship obj inside employee ,coz employee has friendship list. 
                    if(notFirst) sb.append(",");
                    if(f.getID1() ==me.getKey()) {
                        sb.append(String.valueOf(f.getID2()));
                    }
                        else{
                            sb.append(String.valueOf(f.getID1())); //like 1,2
                        }
                        notFirst=true;
                    }
                }
                else{ sb.append("None");}

                System.out.println(sb.toString());
            }

        }
}
