namespace GoldGame {
    internal class Group : IParty {

        public Group (string Name) {
            this.Name = Name;
        }

        public int Gold { get; set; }
        public string Name { get; set; }
    }
}