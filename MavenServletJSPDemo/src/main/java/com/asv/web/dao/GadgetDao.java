package com.asv.web.dao;

import com.asv.web.model.Gadget;

public class GadgetDao {
    public Gadget getGadget(int gid) {
        Gadget g = new Gadget();
        g.setGid(101);
        g.setGname("Mac");
        g.setPrice(500);

        return g;
    }

}
