package com.stackroute.service;

import com.stackroute.domain.Track;
import com.stackroute.exception.TrackAlreadyExistsException;
import com.stackroute.exception.TrackNotFoundException;
import java.util.List;
import java.util.Optional;
//service interface containing methods that need to be implemented

public interface TrackService {
     public Track saveTrack(Track track) throws TrackAlreadyExistsException;
     public Optional<Track> displayTrackByTrackId(int id) throws TrackNotFoundException;
     public Track updateCommentsOfTrack(Track track);
     public void deleteTrack(int id) ;
     public List<Track> getAllTracks();
     public List<Track> findByName(String name);
}
