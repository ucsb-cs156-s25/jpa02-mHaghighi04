package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

    @Test
    public void toString_returns_correct_string(){
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void equals_correct_same_object(){
        assert(team.equals(team));
    }

    @Test
    public void equals_object_different_type(){
        boolean b = !team.equals("hello");
        assert(b);
    }

    @Test
    public void equals_same_name_same_members(){
        Team t = new Team("test-team");
        assert(t.equals(team));
    }
    
    @Test
    public void equals_different_name_same_members(){
        Team t = new Team("testing-team");
        assert(!t.equals(team));
    }

    @Test
    public void equals_same_name_different_members(){
        Team t = new Team("test-team");
        t.addMember("Milad");
        assert(!t.equals(team));
    }

    @Test
    public void hash_equal_for_equal_objects(){
        int result = team.hashCode();
        int expectedResult = -1226298695;
        assertEquals(expectedResult, result);
    }


}
