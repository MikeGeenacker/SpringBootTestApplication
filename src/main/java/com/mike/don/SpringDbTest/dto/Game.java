package com.mike.don.SpringDbTest.dto;

import org.hibernate.annotations.Check;

import javax.persistence.*;

@Entity
@Table(name="GAMES")
public class Game {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="PLAYER_ONE_ID", referencedColumnName = "id")
    @Check(constraints="PLAYER_ONE_ID <> PLAYER_TWO_ID")
//    columnDefinition =  "INT CHECK (player_one_id <> player_two_id")
    private Player player_one_id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="PLAYER_TWO_ID", referencedColumnName = "id")
    @Check(constraints="PLAYER_TWO_ID <> PLAYER_ONE_ID")
//    columnDefinition =  "INT CHECK (player_two_id <> player_one_id")
    private Player player_two_id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="PLAYER_WON_ID", referencedColumnName = "id")
    @Check(constraints="(PLAYER_WON_ID = PLAYER_ONE_ID OR PLAYER_WON_ID = PLAYER_TWO_ID)")
//            columnDefinition =  "INT CHECK (player_won_id == player_one_id OR" +
//            "                               player_won_id == player_two_id)")
    private Player player_won_id;

    @Column(name= "location")
    private String location;

    @Column(name= "date_played")
    private String date_played;

    @Column(name= "time_played")
    private int time_played;
}
