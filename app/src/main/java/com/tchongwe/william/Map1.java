package com.tchongwe.william;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Map1 extends FragmentActivity implements OnMapReadyCallback {
//william tchongwe
    //15922
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map1);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


        LatLng smithFieldNorth = new LatLng(53.349562, -6.278198);
        mMap.addMarker(new MarkerOptions().position(smithFieldNorth).title("SmithField North"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(smithFieldNorth, 20));

        LatLng clonmelStreet = new LatLng(53.336021, -6.26298);
        mMap.addMarker(new MarkerOptions().position(clonmelStreet).title("Clonmel Street"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(clonmelStreet, 20));

        LatLng parnellSquareNorth = new LatLng(53.353462, -6.265305);
        mMap.addMarker(new MarkerOptions().position( parnellSquareNorth).title("Parnell Square North"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom( parnellSquareNorth, 20));

        LatLng mountStreetLower = new LatLng(53.33796, -6.24153);
        mMap.addMarker(new MarkerOptions().position( mountStreetLower).title("Mount Street Lower"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom( mountStreetLower, 20));

        LatLng christChurchPlace = new LatLng(53.343368, -6.27012);
        mMap.addMarker(new MarkerOptions().position( christChurchPlace).title("ChristChurch Place"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom( christChurchPlace, 20));

        LatLng granthamStreet = new LatLng(53.334123, -6.265436);
        mMap.addMarker(new MarkerOptions().position( granthamStreet).title("Grantham Street"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom( granthamStreet, 20));

        LatLng pearseStreet = new LatLng(53.344304, -6.250427);
        mMap.addMarker(new MarkerOptions().position( pearseStreet).title("Pearse Street"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom( pearseStreet, 20));

        LatLng yorkStreetEast = new LatLng(53.338755, -6.262003);
        mMap.addMarker(new MarkerOptions().position( yorkStreetEast).title("York Street East"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom( yorkStreetEast, 20));

        LatLng exciseWalk = new LatLng(53.347777, -6.244239);
        mMap.addMarker(new MarkerOptions().position( exciseWalk).title("Excise Walk"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom( exciseWalk, 20));

        LatLng fitzwilliamSquareWest = new LatLng(53.336074, -6.252825);
        mMap.addMarker(new MarkerOptions().position( fitzwilliamSquareWest).title("Fitzwilliam Square West"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom( fitzwilliamSquareWest, 20));

        LatLng portobelloRoad = new LatLng(53.330091, -6.268044);
        mMap.addMarker(new MarkerOptions().position( portobelloRoad).title("Portobello Road"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom( portobelloRoad, 20));

        LatLng stJamesHospitalCentral = new LatLng(53.339983, -6.295594);
        mMap.addMarker(new MarkerOptions().position( stJamesHospitalCentral).title("ST.James Hospital(CENTRAL"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom( stJamesHospitalCentral, 20));

        LatLng parnellStreet = new LatLng(53.350929, -6.265125);
        mMap.addMarker(new MarkerOptions().position( parnellStreet).title("Parnell Street"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom( parnellStreet, 20));

        LatLng frederickStreetSouth = new LatLng(53.341515, -6.256853);
        mMap.addMarker(new MarkerOptions().position( frederickStreetSouth).title("Frederick Street South"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom( frederickStreetSouth, 20));

        LatLng fownesStreetUpper = new LatLng(53.344603, -6.263371);
        mMap.addMarker(new MarkerOptions().position( fownesStreetUpper).title("Fownes Street Upper"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom( fownesStreetUpper, 20));

        LatLng clarendonRow = new LatLng(53.340927, -6.262501);
        mMap.addMarker(new MarkerOptions().position( clarendonRow).title("Claredon Row"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom( clarendonRow, 20));

        LatLng customHouse = new LatLng(53.348279, -6.254662);
        mMap.addMarker(new MarkerOptions().position( customHouse).title("Custom House"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom( parnellSquareNorth, 20));

        LatLng hanoverQuay = new LatLng(53.344115, -6.237153);
        mMap.addMarker(new MarkerOptions().position( hanoverQuay).title("Hanover Quay"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(hanoverQuay, 20));

        LatLng oliverBondStreet = new LatLng(53.343893, -6.280531);
        mMap.addMarker(new MarkerOptions().position(oliverBondStreet).title("Oliver Bond Street"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(oliverBondStreet, 20));

        LatLng collinsBarracksMuseum = new LatLng(53.347477, -6.28525);
        mMap.addMarker(new MarkerOptions().position( collinsBarracksMuseum).title("Collins Barracks Museum"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(collinsBarracksMuseum, 20));

        LatLng brookfieldRoad = new LatLng(53.339005, -6.300217);
        mMap.addMarker(new MarkerOptions().position( brookfieldRoad).title("Brookfield Road"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom( brookfieldRoad, 20));

        LatLng bensonStreet = new LatLng(53.344153, -6.233451);
        mMap.addMarker(new MarkerOptions().position( bensonStreet).title("Benson Street"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom( bensonStreet, 20));

        LatLng earlsfortTerrace = new LatLng(53.334019, -6.258371);
        mMap.addMarker(new MarkerOptions().position(earlsfortTerrace).title("Earlsfort Terrace"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom( earlsfortTerrace, 20));

        LatLng goldenLane = new LatLng(53.340803, -6.267732);
        mMap.addMarker(new MarkerOptions().position( goldenLane).title("Golden Lane"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom( goldenLane, 20));

        LatLng deverellPlace = new LatLng(53.351464, -6.255265);
        mMap.addMarker(new MarkerOptions().position(deverellPlace).title("Deverell Place"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(deverellPlace, 20));

        LatLng johnStreetWest = new LatLng(53.343105, -6.277167);
        mMap.addMarker(new MarkerOptions().position( johnStreetWest).title("John Street West"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(johnStreetWest, 20));

        LatLng feinianStreet = new LatLng(53.341428, -6.24672);
        mMap.addMarker(new MarkerOptions().position(feinianStreet).title("Feinian Street"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(feinianStreet, 20));

        LatLng southDockRoad = new LatLng(53.341833, -6.231291);
        mMap.addMarker(new MarkerOptions().position(southDockRoad).title("South Dock Road"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(southDockRoad, 20));

        LatLng cityQuay = new LatLng(53.346637, -6.246154);
        mMap.addMarker(new MarkerOptions().position(cityQuay).title("City Quay"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(cityQuay, 20));

        LatLng exchequerStreet = new LatLng(53.343034, -6.263578);
        mMap.addMarker(new MarkerOptions().position(exchequerStreet).title("Exchequer Street"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(exchequerStreet, 20));

        LatLng thePoint = new LatLng(53.346867, -6.230852);
        mMap.addMarker(new MarkerOptions().position(thePoint).title("The Point"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(thePoint, 20));

        LatLng hatchStreet = new LatLng(53.33403, -6.260714);
        mMap.addMarker(new MarkerOptions().position(hatchStreet).title("Hatch Street"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(hatchStreet, 20));

        LatLng limeStreet = new LatLng(53.346026, -6.243576);
        mMap.addMarker(new MarkerOptions().position(limeStreet).title("Lime Street"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(limeStreet, 20));

        LatLng charlemontPlace = new LatLng(53.330662, -6.260177);
        mMap.addMarker(new MarkerOptions().position(charlemontPlace).title("Charlemont Place"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(charlemontPlace, 20));

        LatLng kilmainhamGaol = new LatLng(53.342113, -6.310015);
        mMap.addMarker(new MarkerOptions().position(kilmainhamGaol).title("Exchequer Street"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(kilmainhamGaol, 20));

        LatLng hardwickePlace = new LatLng(53.357043, -6.263232);
        mMap.addMarker(new MarkerOptions().position(hardwickePlace).title("Hardwicke Place"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(hardwickePlace, 20));

        LatLng wolfeToneStreet = new LatLng(53.348875, -6.267459);
        mMap.addMarker(new MarkerOptions().position(wolfeToneStreet).title("Wolfe Tone Street"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(wolfeToneStreet, 20));

        LatLng francisStreet = new LatLng(53.342081, -6.275233);
        mMap.addMarker(new MarkerOptions().position(francisStreet).title("Francis Street"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(francisStreet, 20));

        LatLng greekStreet = new LatLng(53.346874, -6.272976);
        mMap.addMarker(new MarkerOptions().position(greekStreet).title("Greek Street"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(greekStreet, 20));

        LatLng guildStreet = new LatLng(53.347932, -6.240928);
        mMap.addMarker(new MarkerOptions().position(guildStreet).title("Guild Street"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(guildStreet, 20));

        LatLng herbertPlace = new LatLng(53.334432, -6.245575);
        mMap.addMarker(new MarkerOptions().position(hatchStreet).title("Exchequer Street"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(herbertPlace, 20));

        LatLng highStreet = new LatLng(53.343565, -6.275071);
        mMap.addMarker(new MarkerOptions().position(highStreet).title("High Street"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(highStreet, 20));

        LatLng northcircularRoad = new LatLng(53.359624, -6.260348);
        mMap.addMarker(new MarkerOptions().position(northcircularRoad).title("North Circular Road"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(northcircularRoad, 20));
    }


}
