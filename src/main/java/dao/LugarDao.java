package dao;

import java.util.List;

import org.springframework.stereotype.Service;

import model.Lugar;
@Service
public interface LugarDao {
		//Añadir trabajador
		void addLugar(Lugar lugar);
		
		//Eliminar trabajador (Pasando objeto)
		void removeLugar(Lugar lugar);
		
		// Devuelve todos los lugars
		List<Lugar> getLugar();
		
		//Eliminar trabajador (Pasando clave primaria)
		void removeLugar(int idLugar);
		
		// Devuelve un lugar, Busca un lugar por su id 
		Lugar retrieveLugar(int idLugar);
		
		// Modifica un lugar 
		void updateLugar(Lugar lugar);
}
