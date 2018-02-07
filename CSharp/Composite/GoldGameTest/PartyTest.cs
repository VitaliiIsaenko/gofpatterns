using GoldGame;
using System.Collections.Generic;
using Xunit;

namespace GoldGameTest {
    public class PartyTest {
        [Fact]
        public void GetPersonInGroupGold () {
            //Arrange
            Group party = new Group ("Group of many");
            Person bob = new Person ("Bob");
            Person mark = new Person ("Mark");
            party.Members = new List<IParty> () { bob, mark };
            party.Gold = 1500;

            //Action
            int bobGold = bob.Gold;

            //Assert
            Assert.Equal (750, bobGold);
        }

        [Fact]
        public void GetPersonInGroupWithinAnotherGroupGold () {
            //Arrange
            Group partyHard = new Group ("Group with members and a group");
            Person bob = new Person ("Bob");
            Person mark = new Person ("Mark");
            Group groupWithinGroup = new Group ("Group within a group");
            Person carl = new Person ("Carl");
            Person mike = new Person ("Mike");
            groupWithinGroup.Members = new List<IParty> () { carl, mike };
            partyHard.Members = new List<IParty> () { bob, mark, groupWithinGroup };
            partyHard.Gold = 1500;

            //Action
            int mikeGold = mike.Gold;
            int bobGold = bob.Gold;

            //Assert
            Assert.Equal (250, mikeGold);
            Assert.Equal (500, bobGold);
        }
    }
}