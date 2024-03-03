package com.example.ethiopia;

import java.util.HashMap;
import java.util.Map;

// PlaceRepository.java
public class PlaceRepository {
    private Map<String, Place> places;

    public PlaceRepository() {
        places = new HashMap<>();

        // Add place data here
        places.put("Addis Ababa", new Place(
                "Addis Ababa",
                "Addis Ababa, the capital city of Ethiopia, is a vibrant metropolis situated in the highlands bordering the Great Rift Valley. Known for its rich history and cultural diversity, the city boasts the National Museum, exhibiting Ethiopian art, traditional crafts, and prehistoric fossils. The copper-domed Holy Trinity Cathedral, the burial place of Emperor Haile Selassie, is a neo-baroque architectural landmark.",
                "https://en.wikipedia.org/wiki/Addis_Ababa",
                R.drawable.addis,
                R.drawable.addis1,
                R.drawable.addis2,
                R.drawable.addis3
        ));

        places.put("Tigray", new Place(
                "Tigray",
                "Tigray, located in northern Ethiopia, is a region renowned for its ancient rock-hewn churches and historical significance. The Tigray Region, the northernmost in Ethiopia, is the homeland of the Tigrayan, Saho, and Irob people. Mekelle, the capital and largest city, serves as a gateway to explore the unique cultural heritage and historical sites of the region.",
                "https://en.wikipedia.org/wiki/Tigray_Region",
                R.drawable.tigray,
                R.drawable.tigray,
                R.drawable.tigray,
                R.drawable.tigray
        ));

        places.put("Oromia", new Place(
                "Oromia",
                "Oromia, the largest region in Ethiopia, encompasses diverse landscapes, cultures, and traditions. From the bustling capital of Addis Ababa to the rural areas, Oromia offers a rich tapestry of experiences. Visitors can immerse themselves in the warmth of the people, witness traditional ceremonies, and appreciate the breathtaking natural beauty that defines this region.",
                "https://en.wikipedia.org/wiki/Oromia",
                R.drawable.oromia,
                R.drawable.oromia1,
                R.drawable.oromia2,
                R.drawable.oromia3
        ));

        places.put("Amhara", new Place(
                "Amhara",
                "Amhara, situated in the northwest of Ethiopia, is a region steeped in history and cultural richness. The ancient city of Gondar, with its impressive castles and churches, stands as a testament to the region's historical significance. As visitors explore Amhara, they encounter a vibrant tapestry of traditions, from lively festivals to unique culinary experiences.",
                "https://en.wikipedia.org/wiki/Amhara_people",
                R.drawable.amhara,
                R.drawable.addis,
                R.drawable.addis,
                R.drawable.addis
        ));

        places.put("Afar", new Place(
                "Afar",
                "Afar is a region in northeastern Ethiopia known for its unique landscapes and rich cultural heritage. The region is characterized by the Danakil Depression, one of the hottest and lowest places on Earth. Visitors to Afar can witness vibrant traditions, explore salt flats, and marvel at the otherworldly landscapes.",
                "https://en.wikipedia.org/wiki/Afar_Region",
                R.drawable.afar,
                R.drawable.addis,
                R.drawable.addis,
                R.drawable.addis
        ));

        places.put("Gambela", new Place(
                "Gambela",
                "Gambela is a region in western Ethiopia known for its diverse ethnic groups and lush landscapes. The region is home to the Anuak people and offers opportunities to experience their unique customs and traditions. Gambela National Park showcases the region's biodiversity, including elephants, buffalos, and various bird species.",
                "https://en.wikipedia.org/wiki/Gambela_Region",
                R.drawable.gambela,
                R.drawable.addis,
                R.drawable.addis,
                R.drawable.addis
        ));

        places.put("Dire Dawa", new Place(
                "Dire Dawa",
                "Dire Dawa is a city in eastern Ethiopia with a rich history and cultural diversity. The city is a melting pot of various ethnic groups and has a distinct architectural charm. Visitors can explore the old town, visit the colorful markets, and experience the lively atmosphere that defines Dire Dawa.",
                "https://en.wikipedia.org/wiki/Dire_Dawa",
                R.drawable.dire_dawa,
                R.drawable.addis,
                R.drawable.addis,
                R.drawable.addis
        ));

        places.put("Somali", new Place(
                "Somali",
                "Somali is a region in southeastern Ethiopia known for its arid landscapes and unique cultural heritage. The region is home to the Somali people, and visitors can experience their nomadic way of life. Somali offers a glimpse into the traditional practices, music, and vibrant markets of the Somali people.",
                "https://en.wikipedia.org/wiki/Somali_Region",
                R.drawable.somali,
                R.drawable.somali1,
                R.drawable.somali2,
                R.drawable.somali3
        ));

        places.put("Benshangul", new Place(
                "Benshangul",
                "Benshangul is a region in western Ethiopia with diverse ethnic groups and natural attractions. The region is known for the Blue Nile Falls, a breathtaking waterfall surrounded by lush greenery. Visitors to Benshangul can explore the unique culture of the Gumuz people and enjoy the scenic beauty of the region.",
                "https://en.wikipedia.org/wiki/Benishangul-Gumuz_Region",
                R.drawable.benshangul,
                R.drawable.addis,
                R.drawable.addis,
                R.drawable.addis
        ));
    }

    public Map<String, Place> getPlaces() {
        return places;
    }

    public Place getPlaceByName(String name) {
        return places.get(name);
    }
}
