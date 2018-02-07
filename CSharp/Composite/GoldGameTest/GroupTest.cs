using GoldGame;
using Xunit;

namespace GoldGameTest
{
    public class GroupTest
    {
        
        [Fact]
        public void GetGroupGold() {
            //Arrange
            IParty group = new Group("Best group");
            group.Gold = 1000;

            //Action
            int groupGold = group.Gold;

            //Assert
            Assert.Equal(1000, groupGold);
        }
    }
}