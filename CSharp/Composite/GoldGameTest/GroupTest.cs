using System.Collections.Generic;
using GoldGame;
using Xunit;

namespace GoldGameTest
{
    public class GroupTest
    {
        
        [Fact]
        public void GetGroupGold() {
            //Arrange
            Group group = new Group("Best group");
            group.Members = new List<IParty>() {new Person("bob"), new Person("Carl")};
            group.Gold = 1000;

            //Action
            int groupGold = group.Gold;

            //Assert
            Assert.Equal(1000, groupGold);
        }
    }
}