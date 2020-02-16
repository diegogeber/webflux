package com.apirest.webflux;

/*import java.util.UUID;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.apirest.webflux.document.Playlist;
import com.apirest.webflux.repository.PlaylistRepository;

import reactor.core.publisher.Flux;

@Component
public class DummyData implements CommandLineRunner{
	
	
	private final PlaylistRepository playlistRepository;
	
	public DummyData(PlaylistRepository playlistRepository) {
		this.playlistRepository = playlistRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		
				playlistRepository.deleteAll()
					.thenMany(Flux.just("Rock","Pop","Samba","Funk","Nacional","Internacional")
								  		.map(name -> new Playlist(UUID.randomUUID().toString(), name))
								  		.flatMap(playlistRepository::save))
					.subscribe(System.out::println);
	}
	
	
}
*/