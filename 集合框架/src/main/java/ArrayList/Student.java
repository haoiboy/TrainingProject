package ArrayList;

    public class Student {
        private  String stuId;
        private String userName;
        private int age;
        private String address;

        public String getStuId() {
            return stuId;
        }

        public Student(String stuId, String userName, int age, String address) {
            this.stuId = stuId;
            this.userName = userName;
            this.age = age;
            this.address = address;
        }

        public void setStuId(String stuId) {
            this.stuId = stuId;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        /**
         * 1.构造方法
         * 2.set方法
         */
        public Student(String username, int age) {
            this.userName = username;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + userName + '\'' +
                    ", age=" + age +
                    '}';
        }

        public String getUserName() {
            return userName;
        }

        public int getAge() {
            return age;
        }
    }

