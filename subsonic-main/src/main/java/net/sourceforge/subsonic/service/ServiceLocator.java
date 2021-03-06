/*
 This file is part of Subsonic.

 Subsonic is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 Subsonic is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with Subsonic.  If not, see <http://www.gnu.org/licenses/>.

 Copyright 2009 (C) Sindre Mehus
 */
package net.sourceforge.subsonic.service;

import net.sourceforge.subsonic.service.metadata.MetaDataParserFactory;

/**
 * Locates services for objects that are not part of the Spring context.
 *
 * @author Sindre Mehus
 */
public class ServiceLocator {

    private static SettingsService settingsService;
    private static MediaFolderService mediaFolderService;
    private static MediaFileService mediaFileService;
    private static MetaDataParserFactory metaDataParserFactory;

    private ServiceLocator() {
    }

    public static SettingsService getSettingsService() {
        return settingsService;
    }

    public static void setSettingsService(SettingsService settingsService) {
        ServiceLocator.settingsService = settingsService;
    }

    public static MediaFileService getMediaFileService() {
        return mediaFileService;
    }

    public static void setMediaFileService(MediaFileService mediaFileService) {
        ServiceLocator.mediaFileService = mediaFileService;
    }

    public static MetaDataParserFactory getMetaDataParserFactory() {
        return metaDataParserFactory;
    }

    public static void setMetaDataParserFactory(MetaDataParserFactory metaDataParserFactory) {
        ServiceLocator.metaDataParserFactory = metaDataParserFactory;
    }

	public static MediaFolderService getMediaFolderService() {
		return mediaFolderService;
	}

	public static void setMediaFolderService(MediaFolderService mediaFolderService) {
		ServiceLocator.mediaFolderService = mediaFolderService;
	}
    
}

