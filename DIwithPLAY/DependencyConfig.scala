package com.orienit.spark.training.sparkexamplenew

import com.google.inject.Binder
import com.google.inject.AbstractModule
import com.google.inject.Provides
import com.google.inject.Injector

class DependencyConfig extends AbstractModule {
  override def configure() = {
    bind(classOf[Messaging]).to(classOf[email])
  }
}