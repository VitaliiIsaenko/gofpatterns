using System;
using System.Collections.Generic;
using Xunit;
using GoldGame;

namespace GoldGameTest
{
    public class PersonTest
    {
        [Fact]
        public void GetPersonGold()
        {
            //Arrange
            IParty bob = new Person("Bob");
            bob.Gold = 1500;

            //Action
            int bobGold = bob.Gold;

            //Assert
            Assert.Equal(1500,bobGold);

        }

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
