/*package mainPack.Database;

import javax.persistence.*;
import javax.persistence.*;


    @Entity
    @Table(name = "users")
    //@NamedQuery(name = "getAll", query = "SELECT c from User c")
    public class User {
        @Id
        @GeneratedValue(strategy =  GenerationType.AUTO)
        @Column(name = "id")
        private int id;

        @Column(name = "name", length = 30)
        private String name;

        public  User() {}
        public User(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public String toString() {
            return name + ", ";
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }


*/