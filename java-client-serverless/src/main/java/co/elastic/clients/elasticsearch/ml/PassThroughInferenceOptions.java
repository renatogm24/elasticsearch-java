/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: ml._types.PassThroughInferenceOptions

/**
 * Pass through configuration options
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#ml._types.PassThroughInferenceOptions">API
 *      specification</a>
 */
@JsonpDeserializable
public class PassThroughInferenceOptions implements InferenceConfigCreateVariant, JsonpSerializable {
	@Nullable
	private final TokenizationConfig tokenization;

	@Nullable
	private final String resultsField;

	@Nullable
	private final Vocabulary vocabulary;

	// ---------------------------------------------------------------------------------------------

	private PassThroughInferenceOptions(Builder builder) {

		this.tokenization = builder.tokenization;
		this.resultsField = builder.resultsField;
		this.vocabulary = builder.vocabulary;

	}

	public static PassThroughInferenceOptions of(Function<Builder, ObjectBuilder<PassThroughInferenceOptions>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * InferenceConfigCreate variant kind.
	 */
	@Override
	public InferenceConfigCreate.Kind _inferenceConfigCreateKind() {
		return InferenceConfigCreate.Kind.PassThrough;
	}

	/**
	 * The tokenization options
	 * <p>
	 * API name: {@code tokenization}
	 */
	@Nullable
	public final TokenizationConfig tokenization() {
		return this.tokenization;
	}

	/**
	 * The field that is added to incoming documents to contain the inference
	 * prediction. Defaults to predicted_value.
	 * <p>
	 * API name: {@code results_field}
	 */
	@Nullable
	public final String resultsField() {
		return this.resultsField;
	}

	/**
	 * API name: {@code vocabulary}
	 */
	@Nullable
	public final Vocabulary vocabulary() {
		return this.vocabulary;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.tokenization != null) {
			generator.writeKey("tokenization");
			this.tokenization.serialize(generator, mapper);

		}
		if (this.resultsField != null) {
			generator.writeKey("results_field");
			generator.write(this.resultsField);

		}
		if (this.vocabulary != null) {
			generator.writeKey("vocabulary");
			this.vocabulary.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PassThroughInferenceOptions}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<PassThroughInferenceOptions> {
		@Nullable
		private TokenizationConfig tokenization;

		@Nullable
		private String resultsField;

		@Nullable
		private Vocabulary vocabulary;

		/**
		 * The tokenization options
		 * <p>
		 * API name: {@code tokenization}
		 */
		public final Builder tokenization(@Nullable TokenizationConfig value) {
			this.tokenization = value;
			return this;
		}

		/**
		 * The tokenization options
		 * <p>
		 * API name: {@code tokenization}
		 */
		public final Builder tokenization(Function<TokenizationConfig.Builder, ObjectBuilder<TokenizationConfig>> fn) {
			return this.tokenization(fn.apply(new TokenizationConfig.Builder()).build());
		}

		/**
		 * The field that is added to incoming documents to contain the inference
		 * prediction. Defaults to predicted_value.
		 * <p>
		 * API name: {@code results_field}
		 */
		public final Builder resultsField(@Nullable String value) {
			this.resultsField = value;
			return this;
		}

		/**
		 * API name: {@code vocabulary}
		 */
		public final Builder vocabulary(@Nullable Vocabulary value) {
			this.vocabulary = value;
			return this;
		}

		/**
		 * API name: {@code vocabulary}
		 */
		public final Builder vocabulary(Function<Vocabulary.Builder, ObjectBuilder<Vocabulary>> fn) {
			return this.vocabulary(fn.apply(new Vocabulary.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PassThroughInferenceOptions}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PassThroughInferenceOptions build() {
			_checkSingleUse();

			return new PassThroughInferenceOptions(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PassThroughInferenceOptions}
	 */
	public static final JsonpDeserializer<PassThroughInferenceOptions> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PassThroughInferenceOptions::setupPassThroughInferenceOptionsDeserializer);

	protected static void setupPassThroughInferenceOptionsDeserializer(
			ObjectDeserializer<PassThroughInferenceOptions.Builder> op) {

		op.add(Builder::tokenization, TokenizationConfig._DESERIALIZER, "tokenization");
		op.add(Builder::resultsField, JsonpDeserializer.stringDeserializer(), "results_field");
		op.add(Builder::vocabulary, Vocabulary._DESERIALIZER, "vocabulary");

	}

}
