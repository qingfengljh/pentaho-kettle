package org.pentaho.di.trans.steps.fieldschangesequence;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.pentaho.di.core.exception.KettleException;
import org.pentaho.di.trans.steps.loadsave.LoadSaveTester;

public class FieldsChangeSequenceMetaTest {

  @Test
  public void testStepMeta() throws KettleException {
    List<String> attributes = Arrays.asList( "start", "increment", "resultfieldName", "name" );

    Map<String, String> getterMap = new HashMap<String, String>();
    getterMap.put( "start", "getStart" );
    getterMap.put( "increment", "getIncrement" );
    getterMap.put( "resultfieldName", "getResultFieldName" );
    getterMap.put( "name", "getFieldName" );

    Map<String, String> setterMap = new HashMap<String, String>();
    setterMap.put( "start", "setStart" );
    setterMap.put( "increment", "setIncrement" );
    setterMap.put( "resultfieldName", "setResultFieldName" );
    setterMap.put( "name", "setFieldName" );

    LoadSaveTester loadSaveTester = new LoadSaveTester( FieldsChangeSequenceMeta.class, attributes, getterMap, setterMap );
    loadSaveTester.testRepoRoundTrip();
    loadSaveTester.testXmlRoundTrip();
  }
}