package com.example.seminarul_4;

import java.util.ArrayList;

public class ImagineButoi {

    private String imagineUrl;
    private String descriere;
    private String linkPagina;

    public ImagineButoi(String imagineUrl, String descriere, String linkPagina) {
        this.imagineUrl = imagineUrl;
        this.descriere = descriere;
        this.linkPagina = linkPagina;
    }

    public String getImagineUrl() {
        return imagineUrl;
    }

    public String getDescriere() {
        return descriere;
    }

    public String getLinkPagina() {
        return linkPagina;
    }

    public static ArrayList<ImagineButoi> lista() {
        ArrayList<ImagineButoi> lista = new ArrayList<>();

        lista.add(new ImagineButoi(
                "https://prourban.ro/wp-content/uploads/2024/04/butoi-lemn-de-stejar-ProUrban.ro_.png",
                "Butoi Lemn",
                "https://prourban.ro/produs/butoi-lemn-din-stejar-20l/?srsltid=AYCX9vKQC2UtiOwhCR8xCPMw8lSZpgokOYO-bW1_siuYyx0Yz41Y9GkU"));

        lista.add(new ImagineButoi(
                "https://cdn.dsmcdn.com/mnresize/620/920/ty1950/prod/QC_PREP/20260901/22/663fa8e6-5b7f-3d87-99b2-c57ba2caaeec/1_org_zoom.jpg",
                "Butoi plastic",
                "https://www.trendyol.com/ro/sokshop/butoi-de-60-l-cu-inel-metalic-p-1194541636?countryCode=RO&storefrontId=29&language=ro&gads=true&itemNumber=1677860204&tyutm_source=google&tyutm_medium=cpc&tyutm_campaign=bu:cee_r:eu_c:ro_dom:dig_ch:ggl_p:acq_t:pla_obj:cpc_os:all_au:mass_cat:home_maxclick&adjust_t=1lbcce2a_1lura6nh&adjust_campaign=bu:cee_r:eu_c:ro_dom:dig_ch:ggl_p:acq_t:pla_obj:cpc_os:all_au:mass_cat:home_maxclick&isInstallPDP=true&medium=digital&adjust_tracker_limit=999999999&gad_source=1&gad_campaignid=24375021320&gbraid=0AAAAAC4iUIy9IcjeVZk9P9Lzit_ptinIk&gclid=Cj0KCQiAnsvXBhCqARIsAHKgGNYwyZnW-sFzsG17Rc2O9cHgquLac2m4KeyKBXds9sc2ubFv4CBu8aYaAq6pEALw_wcB"));


        lista.add(new ImagineButoi(
                "https://www.cleanmag.ro/pub/media/catalog/product/cache/848bc4920063e063974f4526794a93c0/b/u/butoi_metalic_cu_capac_mobil_200l.jpg",
                "Butoi metal",
                "https://www.cleanmag.ro/butoi-metalic-cu-capac-mobil-200-litri.html"));

        lista.add(new ImagineButoi(
                "https://www.bonalux.ro/poze/butoi-din-sticla-5-l-635521-1693398927.jpg",
                "Butoi sticla",
                "https://www.bonalux.ro/butoi-din-sticla-5-l-635521.html?srsltid=AYCX9vK3jhbb0-VNg4aoGvPBB5mvh4K2AcQZTnWdC80QPpc-_HtZFoin"));

        lista.add(new ImagineButoi(
                "https://dexrom.ro/media/catalog/product/cache/1/image/9df78eab33525d08d6e5fb8d27136e95/7/-/7-20230406_170159_1.jpg",
                "Butoi carton",
                "https://dexrom.ro/butoi-60l-r?srsltid=AYCX9vKcEQ6YOQz6wzkdOGb2FjQaLbKz259ya4P3XHEE6s4gIiWU784t"));
        return lista;


    }


}


