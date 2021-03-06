/**
 * Copyright (C) 2013-2015 Vasilis Vryniotis <bbriniotis@datumbox.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.datumbox.framework.statistics.distributions;


import com.datumbox.configuration.TestConfiguration;
import com.datumbox.tests.bases.BaseTest;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Vasilis Vryniotis <bbriniotis@datumbox.com>
 */
public class ContinuousDistributionsTest extends BaseTest {
    
    /**
     * Test of ChisquareCdf method, of class ContinuousDistributions.
     */
    @Test
    public void testChisquareCdf() {
        logger.info("ChisquareCdf");
        double x = 3.0;
        int df = 10;
        double expResult = 0.018575928421771;
        double result = ContinuousDistributions.ChisquareCdf(x, df);
        assertEquals(expResult, result, TestConfiguration.DOUBLE_ACCURACY_HIGH);
    }

    /**
     * Test of GaussCdf method, of class ContinuousDistributions.
     */
    @Test
    public void testGaussCdf() {
        logger.info("GaussCdf");
        double z = 3.0;
        double expResult = 0.9986501025724;
        double result = ContinuousDistributions.GaussCdf(z);
        assertEquals(expResult, result, TestConfiguration.DOUBLE_ACCURACY_HIGH);
    }

    /**
     * Test of LogGamma method, of class ContinuousDistributions.
     */
    @Test
    public void testLogGamma() {
        logger.info("LogGamma");
        double Z = 3.0;
        double expResult = 0.69314718044741;
        double result = ContinuousDistributions.LogGamma(Z);
        assertEquals(expResult, result, TestConfiguration.DOUBLE_ACCURACY_HIGH);
    }

    /**
     * Test of StudentsCdf method, of class ContinuousDistributions.
     */
    @Test
    public void testStudentsCdf() {
        logger.info("StudentsCdf");
        double x = 3.0;
        int df = 10;
        double expResult = 0.99332817273466;
        double result = ContinuousDistributions.StudentsCdf(x, df);
        assertEquals(expResult, result, TestConfiguration.DOUBLE_ACCURACY_HIGH);
    }

    /**
     * Test of ExponentialCdf method, of class ContinuousDistributions.
     */
    @Test
    public void testExponentialCdf() {
        logger.info("ExponentialCdf");
        double x = 3.0;
        double lamda = 10.0;
        double expResult = 0.99999999999991;
        double result = ContinuousDistributions.ExponentialCdf(x, lamda);
        assertEquals(expResult, result, TestConfiguration.DOUBLE_ACCURACY_HIGH);
    }

    /**
     * Test of BetaCdf method, of class ContinuousDistributions.
     */
    @Test
    public void testBetaCdf() {
        logger.info("BetaCdf");
        double x = 0.9;
        double a = 10.0;
        double b = 2.0;
        double expResult = 0.69735688048532;
        double result = ContinuousDistributions.BetaCdf(x, a, b);
        assertEquals(expResult, result, TestConfiguration.DOUBLE_ACCURACY_HIGH);
    }

    /**
     * Test of FCdf method, of class ContinuousDistributions.
     */
    @Test
    public void testFCdf() {
        logger.info("FCdf");
        double x = 3.0;
        int f1 = 10;
        int f2 = 2;
        double expResult = 0.7241964339413;
        double result = ContinuousDistributions.FCdf(x, f1, f2);
        assertEquals(expResult, result, TestConfiguration.DOUBLE_ACCURACY_HIGH);
    }

    /**
     * Test of GammaCdf method, of class ContinuousDistributions.
     */
    @Test
    public void testGammaCdf() {
        logger.info("GammaCdf");
        double x = 9.0;
        double a = 10.0;
        double b = 2.0;
        double expResult = 0.017092718679951;
        double result = ContinuousDistributions.GammaCdf(x, a, b);
        assertEquals(expResult, result, TestConfiguration.DOUBLE_ACCURACY_HIGH);
    }

    /**
     * Test of UniformCdf method, of class ContinuousDistributions.
     */
    @Test
    public void testUniformCdf() {
        logger.info("UniformCdf");
        double x = 3.0;
        double a = 2.0;
        double b = 10.0;
        double expResult = 0.125;
        double result = ContinuousDistributions.UniformCdf(x, a, b);
        assertEquals(expResult, result, TestConfiguration.DOUBLE_ACCURACY_HIGH);
    }

    /**
     * Test of Kolmogorov method, of class ContinuousDistributions.
     */
    @Test
    public void testKolmogorov() {
        logger.info("Kolmogorov");
        double z = 2.0;
        double expResult = 0.99932907474422;
        double result = ContinuousDistributions.Kolmogorov(z);
        assertEquals(expResult, result, TestConfiguration.DOUBLE_ACCURACY_HIGH);
    }

    /**
     * Test of GaussInverseCdf method, of class ContinuousDistributions.
     */
    @Test
    public void testGaussInverseCdf() {
        logger.info("GaussInverseCdf");
        double p = 0.32;
        double expResult = -0.46769879942903;
        double result = ContinuousDistributions.GaussInverseCdf(p);
        assertEquals(expResult, result, TestConfiguration.DOUBLE_ACCURACY_HIGH);
    }

    /**
     * Test of ChisquareInverseCdf method, of class ContinuousDistributions.
     */
    @Test
    public void testChisquareInverseCdf() {
        logger.info("ChisquareInverseCdf");
        double p = 0.32;
        int df = 10;
        double expResult = 11.498788492223;
        double result = ContinuousDistributions.ChisquareInverseCdf(p, df);
        assertEquals(expResult, result, TestConfiguration.DOUBLE_ACCURACY_HIGH);
    }

    /**
     * Test of normalQuantile method, of class ContinuousDistributions.
     */
    @Test
    public void testNormalQuantile() {
        logger.info("normalQuantile");
        double p = 0.32;
        double mu = 1.0;
        double sigma = 1.0;
        double expResult = 0.53230120088549;
        double result = ContinuousDistributions.normalQuantile(p, mu, sigma);
        assertEquals(expResult, result, TestConfiguration.DOUBLE_ACCURACY_HIGH);
    }
    
}
