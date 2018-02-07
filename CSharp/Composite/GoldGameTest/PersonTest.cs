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
            Person bob = new Person("Bob");
            bob.Gold = 1500;

            //Action
            int bobGold = bob.Gold;

            //Assert
            Assert.Equal(1500,bobGold);

        }
    }
}
