using System.Collections.Generic;

namespace GoldGame {
    public class Group : IParty {
        public List<IParty> Members { get; set; }

        public Group (string Name) {
            this.Name = Name;
            Members = new List<IParty>();
        }

        public int Gold {
            get {
                int totalGold = 0;
                foreach (var member in Members) {
                    totalGold += member.Gold;
                }
                return totalGold;
            }
            set {
                Members.ForEach(m => m.Gold = value/Members.Count);
            }
        }
        public string Name { get; set; }
    }
}