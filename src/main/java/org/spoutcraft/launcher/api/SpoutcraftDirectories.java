/*
 * This file is part of Spoutcraft Launcher.
 *
 * Copyright (c) 2011-2012, SpoutDev <http://www.spout.org/>
 * Spoutcraft Launcher is licensed under the SpoutDev License Version 1.
 *
 * Spoutcraft Launcher is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * In addition, 180 days after any changes are published, you can use the
 * software, incorporating those changes, under the terms of the MIT license,
 * as described in the SpoutDev License Version 1.
 *
 * Spoutcraft Launcher is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License,
 * the MIT license and the SpoutDev License Version 1 along with this program.
 * If not, see <http://www.gnu.org/licenses/> for the GNU Lesser General Public
 * License and see <http://www.spout.org/SpoutDevLicenseV1.txt> for the full license,
 * including the MIT license.
 */
package org.spoutcraft.launcher.api;

import java.io.File;

import org.spoutcraft.launcher.api.util.Utils;

public class SpoutcraftDirectories {
	private final File backupDir = new File(Utils.getWorkingDirectory(), "backups");
	private final File binDir = new File(Utils.getWorkingDirectory(), "bin");
	private final File binCacheDir = new File(binDir, "cache");
	private final File spoutcraftDir = new File(Utils.getWorkingDirectory(), "config");
	private final File savesDir = new File(Utils.getWorkingDirectory(), "saves");
	private final File updateDir = new File(Utils.getWorkingDirectory(), "temp");

	public File getBinDir() {
		return binDir;
	}

	public File getBinCacheDir() {
		return binCacheDir;
	}

	public File getBackupDir() {
		return backupDir;
	}

	public File getSpoutcraftDir() {
		return spoutcraftDir;
	}

	public File getSavesDir() {
		return savesDir;
	}

	public File getUpdateDir() {
		return updateDir;
	}
}
