package com.revature.daos;

import java.util.List;

import com.revature.beans.Biome;

public interface BiomeDAO {

	public Biome getBiomeById(int id);

	public List<Biome> getAllBiomes();

	public void addBiome(Biome biome);

	public void updateBiome(Biome biome);

	public void deleteBiome(Biome biome);

}
