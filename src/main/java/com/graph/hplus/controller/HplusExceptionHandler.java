package com.graph.hplus.controller;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.graphql.execution.ErrorType;
import org.springframework.graphql.execution.SecurityDataFetcherExceptionResolver;
import org.springframework.stereotype.Component;

import graphql.GraphQLError;
import graphql.GraphqlErrorBuilder;
import graphql.schema.DataFetchingEnvironment;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class HplusExceptionHandler extends SecurityDataFetcherExceptionResolver
{
	@Override
	protected GraphQLError resolveToSingleError(Throwable ex, DataFetchingEnvironment env)
	{
		ErrorType type = null;
		if(ex instanceof DataIntegrityViolationException)
		{
			type = ErrorType.BAD_REQUEST;
		}
		else
		{
			type = ErrorType.INTERNAL_ERROR;
		}
		return GraphqlErrorBuilder
									.newError(env)
									.message("Received Message", ex.getMessage())
									.errorType(type)
									.build();
	}
}
