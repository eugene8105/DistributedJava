package edu.wctc.pirates.service;

import edu.wctc.pirates.entity.Crew;

import java.util.List;

public interface CrewService {
    List<Crew> getAllCrewMembers();

    Crew getCrewMember(String username);

    int getCrewMemberId(String username);
}
