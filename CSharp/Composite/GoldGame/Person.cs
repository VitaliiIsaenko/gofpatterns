namespace GoldGame {
    public class Person : IParty {
        public Person (string name) {
            this.Name = name;
        }

        public int Gold { get; set; }
        public string Name { get; set; }
    }
}