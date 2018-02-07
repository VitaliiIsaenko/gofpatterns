using System.Collections.Generic;

namespace GoldGame {
    public class Group : IParty {
        public List<IParty> Members { get; set; }
        
        public Group (string Name) {
            this.Name = Name;
        }

        public int Gold { get; set; }
        public string Name { get; set; }
    }
}