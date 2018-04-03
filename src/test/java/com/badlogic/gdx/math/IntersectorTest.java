package com.badlogic.gdx.math;

import org.junit.Assert;
import org.junit.Test;

public class IntersectorTest {

    @Test
    public void testIsPointInTriangle() {
        Vector3 t1 = new Vector3(-1, -1, 0);
        Vector3 t2 = new Vector3(0, 1, 0);
        Vector3 t3 = new Vector3(1, -1, 0);

        Vector3 point = new Vector3(0, 0, 0);

        Assert.assertTrue(Intersector.isPointInTriangle(point, t1, t2, t3));
    }

}
