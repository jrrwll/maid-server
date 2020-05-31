package org.dreamcat.maid.api.controller.share;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Create by tuke on 2020/5/24
 */
@Getter
@Setter
public class GetShareFileQuery {
    @NotNull
    @Min(1 << 22)
    private Long sid;
    private String password;
    // null if sid is a file, else like '/path/to/file_or_dir'
    private String path;
}